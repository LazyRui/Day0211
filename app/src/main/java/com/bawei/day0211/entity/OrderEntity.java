package com.bawei.day0211.entity;

import java.util.List;

/**
 * ProjectName: Day0211
 * PackageName: com.bawei.day0211.entity
 * ClassName:   OrderEntity
 * Description: Java类的作用
 * Author: Lazy
 * CreateDate: 2020/2/11_21:41
 */
public class OrderEntity {

    /**
     * orderList : [{"detailList":[{"commentStatus":1,"commodityCount":1,"commodityId":17,"commodityName":"化妆镜","commodityPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/7/1.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/7/2.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/7/3.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/7/4.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/7/5.jpg","commodityPrice":31,"orderDetailId":13088},{"commentStatus":1,"commodityCount":1,"commodityId":21,"commodityName":"【加绒休闲 舒适轻便】秋冬增高休闲鞋厚底棉鞋运动户外通勤简约韩版女鞋","commodityPic":"http://mobile.bwstudent.com/images/small/commodity/nx/bx/4/1.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/bx/4/2.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/bx/4/3.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/bx/4/4.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/bx/4/5.jpg","commodityPrice":189,"orderDetailId":13089}],"expressCompName":"京东快递","expressSn":"1001","orderId":"2020021112554507027804","orderStatus":1,"orderTime":1581396945000,"payAmount":220,"payMethod":1,"userId":27804},{"detailList":[{"commentStatus":1,"commodityCount":1,"commodityId":17,"commodityName":"化妆镜","commodityPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/7/1.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/7/2.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/7/3.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/7/4.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/7/5.jpg","commodityPrice":31,"orderDetailId":13090},{"commentStatus":1,"commodityCount":1,"commodityId":21,"commodityName":"【加绒休闲 舒适轻便】秋冬增高休闲鞋厚底棉鞋运动户外通勤简约韩版女鞋","commodityPic":"http://mobile.bwstudent.com/images/small/commodity/nx/bx/4/1.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/bx/4/2.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/bx/4/3.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/bx/4/4.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/bx/4/5.jpg","commodityPrice":189,"orderDetailId":13091}],"expressCompName":"京东快递","expressSn":"1001","orderId":"2020021112554588927804","orderStatus":1,"orderTime":1581396946000,"payAmount":220,"payMethod":1,"userId":27804},{"detailList":[{"commentStatus":1,"commodityCount":1,"commodityId":17,"commodityName":"化妆镜","commodityPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/7/1.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/7/2.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/7/3.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/7/4.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/7/5.jpg","commodityPrice":31,"orderDetailId":13086},{"commentStatus":1,"commodityCount":1,"commodityId":21,"commodityName":"【加绒休闲 舒适轻便】秋冬增高休闲鞋厚底棉鞋运动户外通勤简约韩版女鞋","commodityPic":"http://mobile.bwstudent.com/images/small/commodity/nx/bx/4/1.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/bx/4/2.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/bx/4/3.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/bx/4/4.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/bx/4/5.jpg","commodityPrice":189,"orderDetailId":13087}],"expressCompName":"京东快递","expressSn":"1001","orderId":"2020021112480685827804","orderStatus":1,"orderTime":1581396487000,"payAmount":220,"payMethod":1,"userId":27804},{"detailList":[{"commentStatus":1,"commodityCount":1,"commodityId":17,"commodityName":"化妆镜","commodityPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/7/1.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/7/2.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/7/3.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/7/4.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/7/5.jpg","commodityPrice":31,"orderDetailId":13084},{"commentStatus":1,"commodityCount":1,"commodityId":21,"commodityName":"【加绒休闲 舒适轻便】秋冬增高休闲鞋厚底棉鞋运动户外通勤简约韩版女鞋","commodityPic":"http://mobile.bwstudent.com/images/small/commodity/nx/bx/4/1.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/bx/4/2.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/bx/4/3.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/bx/4/4.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/bx/4/5.jpg","commodityPrice":189,"orderDetailId":13085}],"expressCompName":"京东快递","expressSn":"1001","orderId":"2020021112480562827804","orderStatus":1,"orderTime":1581396486000,"payAmount":220,"payMethod":1,"userId":27804},{"detailList":[{"commentStatus":2,"commodityCount":1,"commodityId":17,"commodityName":"化妆镜","commodityPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/7/1.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/7/2.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/7/3.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/7/4.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/7/5.jpg","commodityPrice":31,"orderDetailId":13082},{"commentStatus":2,"commodityCount":1,"commodityId":21,"commodityName":"【加绒休闲 舒适轻便】秋冬增高休闲鞋厚底棉鞋运动户外通勤简约韩版女鞋","commodityPic":"http://mobile.bwstudent.com/images/small/commodity/nx/bx/4/1.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/bx/4/2.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/bx/4/3.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/bx/4/4.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/bx/4/5.jpg","commodityPrice":189,"orderDetailId":13083}],"expressCompName":"京东快递","expressSn":"1001","orderId":"2020021112392347427804","orderStatus":9,"orderTime":1581395963000,"payAmount":220,"payMethod":1,"userId":27804}]
     * message : 查询成功
     * status : 0000
     */

    private String message;
    private String status;
    private List<OrderListBean> orderList;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<OrderListBean> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<OrderListBean> orderList) {
        this.orderList = orderList;
    }

    public static class OrderListBean {
        /**
         * detailList : [{"commentStatus":1,"commodityCount":1,"commodityId":17,"commodityName":"化妆镜","commodityPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/7/1.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/7/2.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/7/3.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/7/4.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/7/5.jpg","commodityPrice":31,"orderDetailId":13088},{"commentStatus":1,"commodityCount":1,"commodityId":21,"commodityName":"【加绒休闲 舒适轻便】秋冬增高休闲鞋厚底棉鞋运动户外通勤简约韩版女鞋","commodityPic":"http://mobile.bwstudent.com/images/small/commodity/nx/bx/4/1.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/bx/4/2.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/bx/4/3.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/bx/4/4.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/bx/4/5.jpg","commodityPrice":189,"orderDetailId":13089}]
         * expressCompName : 京东快递
         * expressSn : 1001
         * orderId : 2020021112554507027804
         * orderStatus : 1
         * orderTime : 1581396945000
         * payAmount : 220
         * payMethod : 1
         * userId : 27804
         */

        private String expressCompName;
        private String expressSn;
        private String orderId;
        private int orderStatus;
        private long orderTime;
        private int payAmount;
        private int payMethod;
        private int userId;
        private List<DetailListBean> detailList;

        public String getExpressCompName() {
            return expressCompName;
        }

        public void setExpressCompName(String expressCompName) {
            this.expressCompName = expressCompName;
        }

        public String getExpressSn() {
            return expressSn;
        }

        public void setExpressSn(String expressSn) {
            this.expressSn = expressSn;
        }

        public String getOrderId() {
            return orderId;
        }

        public void setOrderId(String orderId) {
            this.orderId = orderId;
        }

        public int getOrderStatus() {
            return orderStatus;
        }

        public void setOrderStatus(int orderStatus) {
            this.orderStatus = orderStatus;
        }

        public long getOrderTime() {
            return orderTime;
        }

        public void setOrderTime(long orderTime) {
            this.orderTime = orderTime;
        }

        public int getPayAmount() {
            return payAmount;
        }

        public void setPayAmount(int payAmount) {
            this.payAmount = payAmount;
        }

        public int getPayMethod() {
            return payMethod;
        }

        public void setPayMethod(int payMethod) {
            this.payMethod = payMethod;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public List<DetailListBean> getDetailList() {
            return detailList;
        }

        public void setDetailList(List<DetailListBean> detailList) {
            this.detailList = detailList;
        }

        public static class DetailListBean {
            /**
             * commentStatus : 1
             * commodityCount : 1
             * commodityId : 17
             * commodityName : 化妆镜
             * commodityPic : http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/7/1.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/7/2.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/7/3.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/7/4.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/7/5.jpg
             * commodityPrice : 31
             * orderDetailId : 13088
             */

            private int commentStatus;
            private int commodityCount;
            private int commodityId;
            private String commodityName;
            private String commodityPic;
            private int commodityPrice;
            private int orderDetailId;

            public int getCommentStatus() {
                return commentStatus;
            }

            public void setCommentStatus(int commentStatus) {
                this.commentStatus = commentStatus;
            }

            public int getCommodityCount() {
                return commodityCount;
            }

            public void setCommodityCount(int commodityCount) {
                this.commodityCount = commodityCount;
            }

            public int getCommodityId() {
                return commodityId;
            }

            public void setCommodityId(int commodityId) {
                this.commodityId = commodityId;
            }

            public String getCommodityName() {
                return commodityName;
            }

            public void setCommodityName(String commodityName) {
                this.commodityName = commodityName;
            }

            public String getCommodityPic() {
                return commodityPic;
            }

            public void setCommodityPic(String commodityPic) {
                this.commodityPic = commodityPic;
            }

            public int getCommodityPrice() {
                return commodityPrice;
            }

            public void setCommodityPrice(int commodityPrice) {
                this.commodityPrice = commodityPrice;
            }

            public int getOrderDetailId() {
                return orderDetailId;
            }

            public void setOrderDetailId(int orderDetailId) {
                this.orderDetailId = orderDetailId;
            }
        }
    }
}
