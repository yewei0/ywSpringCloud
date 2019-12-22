package support;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageObject<T> implements Serializable {
    /**
     * 总记录数
     */
   private  int  total;

    /**
     * 分页记录数
     */
   private List<T>  list;
    //开始位置int start =(page -1)*rows
}
