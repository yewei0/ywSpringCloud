$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'hdb/inquirysheet/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', index: 'id', width: 50, key: true },
			{ label: '', name: 'inquiryNo', index: 'inquiry_no', width: 80 }, 			
			{ label: '', name: 'inOut', index: 'in_out', width: 80 }, 			
			{ label: '', name: 'transportModeId', index: 'transport_mode_id', width: 80 }, 			
			{ label: '', name: 'businessType', index: 'business_type', width: 80 }, 			
			{ label: '', name: 'loadingId', index: 'loading_id', width: 80 }, 			
			{ label: '', name: 'dischargeId', index: 'discharge_id', width: 80 }, 			
			{ label: '', name: 'packageMethod', index: 'package_method', width: 80 }, 			
			{ label: '', name: 'serviceIds', index: 'service_ids', width: 80 }, 			
			{ label: '', name: 'transportRequirements', index: 'transport_requirements', width: 80 }, 			
			{ label: '', name: 'transportPreference', index: 'transport_preference', width: 80 }, 			
			{ label: '', name: 'serverPreference', index: 'server_preference', width: 80 }, 			
			{ label: '', name: 'domesticTakeAddress', index: 'domestic_take_address', width: 80 }, 			
			{ label: '', name: 'domesticTabkeContacts', index: 'domestic_tabke_contacts', width: 80 }, 			
			{ label: '', name: 'domesticTabkeTel', index: 'domestic_tabke_tel', width: 80 }, 			
			{ label: '', name: 'domesticDeliveryAddress', index: 'domestic_delivery_address', width: 80 }, 			
			{ label: '', name: 'domesticDeliveryContact', index: 'domestic_delivery_contact', width: 80 }, 			
			{ label: '', name: 'domesticDeliveryTel', index: 'domestic_delivery_tel', width: 80 }, 			
			{ label: '', name: 'domesticHarvestAddress', index: 'domestic_harvest_address', width: 80 }, 			
			{ label: '', name: 'domesticHarvestContacts', index: 'domestic_harvest_contacts', width: 80 }, 			
			{ label: '', name: 'domesticHarvestTel', index: 'domestic_harvest_tel', width: 80 }, 			
			{ label: '', name: 'domesticSendAddress', index: 'domestic_send_address', width: 80 }, 			
			{ label: '', name: 'domesticSendContacts', index: 'domestic_send_contacts', width: 80 }, 			
			{ label: '', name: 'domesticSendTel', index: 'domestic_send_tel', width: 80 }, 			
			{ label: '', name: 'abroadTakeAddress', index: 'abroad_take_address', width: 80 }, 			
			{ label: '', name: 'abroadTakeContacts', index: 'abroad_take_contacts', width: 80 }, 			
			{ label: '', name: 'abroadTakeTel', index: 'abroad_take_tel', width: 80 }, 			
			{ label: '', name: 'abroadDeliveryAddress', index: 'abroad_delivery_address', width: 80 }, 			
			{ label: '', name: 'abroadDeliveryContacts', index: 'abroad_delivery_contacts', width: 80 }, 			
			{ label: '', name: 'abroadDeliveryTel', index: 'abroad_delivery_tel', width: 80 }, 			
			{ label: '', name: 'abroadHarvestAddress', index: 'abroad_harvest_address', width: 80 }, 			
			{ label: '', name: 'abroadHarvestContacts', index: 'abroad_harvest_contacts', width: 80 }, 			
			{ label: '', name: 'abroadHarvestTel', index: 'abroad_harvest_tel', width: 80 }, 			
			{ label: '', name: 'abroadSendAddress', index: 'abroad_send_address', width: 80 }, 			
			{ label: '', name: 'abroadSendContacts', index: 'abroad_send_contacts', width: 80 }, 			
			{ label: '', name: 'abroadSendTel', index: 'abroad_send_tel', width: 80 }, 			
			{ label: '', name: 'mark', index: 'mark', width: 80 }, 			
			{ label: '', name: 'inquiryStatus', index: 'inquiry_status', width: 80 }, 			
			{ label: '', name: 'memberId', index: 'member_id', width: 80 }, 			
			{ label: '', name: 'staffId', index: 'staff_id', width: 80 }, 			
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
		inquirySheet: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.inquirySheet = {};
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
                var url = vm.inquirySheet.id == null ? "hdb/inquirysheet/save" : "hdb/inquirysheet/update";
                $.ajax({
                    type: "POST",
                    url: baseURL + url,
                    contentType: "application/json",
                    data: JSON.stringify(vm.inquirySheet),
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
                        url: baseURL + "hdb/inquirysheet/delete",
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
			$.get(baseURL + "hdb/inquirysheet/info/"+id, function(r){
                vm.inquirySheet = r.inquirySheet;
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