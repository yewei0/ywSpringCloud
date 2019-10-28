$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'hdb/orderexpenses/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', index: 'id', width: 50, key: true },
			{ label: '', name: 'orderId', index: 'order_id', width: 80 }, 			
			{ label: '', name: 'expensesName', index: 'expenses_name', width: 80 }, 			
			{ label: '', name: 'expensesType', index: 'expenses_type', width: 80 }, 			
			{ label: '', name: 'description', index: 'description', width: 80 }, 			
			{ label: '', name: 'currencyId', index: 'currency_id', width: 80 }, 			
			{ label: '', name: 'taxRate', index: 'tax_rate', width: 80 }, 			
			{ label: '', name: 'excludTaxRec', index: 'exclud_tax_rec', width: 80 }, 			
			{ label: '', name: 'containTaxRec', index: 'contain_tax_rec', width: 80 }, 			
			{ label: '', name: 'exchangeRate', index: 'exchange_rate', width: 80 }, 			
			{ label: '', name: 'qty', index: 'qty', width: 80 }, 			
			{ label: '', name: 'weight', index: 'weight', width: 80 }, 			
			{ label: '', name: 'size', index: 'size', width: 80 }, 			
			{ label: '', name: 'status', index: 'status', width: 80 }, 			
			{ label: '', name: 'revision', index: 'revision', width: 80 }, 			
			{ label: '', name: 'createdBy', index: 'created_by', width: 80 }, 			
			{ label: '', name: 'createdTime', index: 'created_time', width: 80 }, 			
			{ label: '', name: 'updatedBy', index: 'updated_by', width: 80 }, 			
			{ label: '', name: 'updatedTime', index: 'updated_time', width: 80 }, 			
			{ label: '', name: 'isDel', index: 'is_del', width: 80 }			
        ],
		viewrecords: true,
        height: 385,
        rowNum: 10,
		rowList : [10,30,50],
        rownumbers: true, 
        rownumWidth: 25, 
        autowidth:true,
        multiselect: true,
        pager: "#jqGridPager",
        jsonReader : {
            root: "page.list",
            page: "page.currPage",
            total: "page.totalPage",
            records: "page.totalCount"
        },
        prmNames : {
            page:"page", 
            rows:"limit", 
            order: "order"
        },
        gridComplete:function(){
        	//隐藏grid底部滚动条
        	$("#jqGrid").closest(".ui-jqgrid-bdiv").css({ "overflow-x" : "hidden" }); 
        }
    });
});

var vm = new Vue({
	el:'#rrapp',
	data:{
		showList: true,
		title: null,
		orderExpenses: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.orderExpenses = {};
		},
		update: function (event) {
			var id = getSelectedRow();
			if(id == null){
				return ;
			}
			vm.showList = false;
            vm.title = "修改";
            
            vm.getInfo(id)
		},
		saveOrUpdate: function (event) {
		    $('#btnSaveOrUpdate').button('loading').delay(1000).queue(function() {
                var url = vm.orderExpenses.id == null ? "hdb/orderexpenses/save" : "hdb/orderexpenses/update";
                $.ajax({
                    type: "POST",
                    url: baseURL + url,
                    contentType: "application/json",
                    data: JSON.stringify(vm.orderExpenses),
                    success: function(r){
                        if(r.code === 0){
                             layer.msg("操作成功", {icon: 1});
                             vm.reload();
                             $('#btnSaveOrUpdate').button('reset');
                             $('#btnSaveOrUpdate').dequeue();
                        }else{
                            layer.alert(r.msg);
                            $('#btnSaveOrUpdate').button('reset');
                            $('#btnSaveOrUpdate').dequeue();
                        }
                    }
                });
			});
		},
		del: function (event) {
			var ids = getSelectedRows();
			if(ids == null){
				return ;
			}
			var lock = false;
            layer.confirm('确定要删除选中的记录？', {
                btn: ['确定','取消'] //按钮
            }, function(){
               if(!lock) {
                    lock = true;
		            $.ajax({
                        type: "POST",
                        url: baseURL + "hdb/orderexpenses/delete",
                        contentType: "application/json",
                        data: JSON.stringify(ids),
                        success: function(r){
                            if(r.code == 0){
                                layer.msg("操作成功", {icon: 1});
                                $("#jqGrid").trigger("reloadGrid");
                            }else{
                                layer.alert(r.msg);
                            }
                        }
				    });
			    }
             }, function(){
             });
		},
		getInfo: function(id){
			$.get(baseURL + "hdb/orderexpenses/info/"+id, function(r){
                vm.orderExpenses = r.orderExpenses;
            });
		},
		reload: function (event) {
			vm.showList = true;
			var page = $("#jqGrid").jqGrid('getGridParam','page');
			$("#jqGrid").jqGrid('setGridParam',{ 
                page:page
            }).trigger("reloadGrid");
		}
	}
});