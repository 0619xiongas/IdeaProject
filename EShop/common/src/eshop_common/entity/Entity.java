package eshop_common.entity;
/*
所有模块实体类的父类
用于封装数据
 */
public class Entity {
    //数据的唯一标识，key
    private String id;
    //数据的创建时间
    private String createTime;
    //数据的删除时间
    private String deleteTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(String deleteTime) {
        this.deleteTime = deleteTime;
    }

    public String getIsDel() {
        return idDel;
    }

    public void setIsDel(String isDel) {
        this.idDel = isDel;
    }

    //数据的删除状态，0表示删除，1正常。默认是1.
    private String idDel = "1";
}
