package com.bwei.im.bean;

import java.util.List;

/**
 * Created by muhanxi on 17/11/3.
 */

public class TestBean {


    /**
     * status : 0
     * msg : ok
     * result : {"total":"58","pagenum":"1","pagesize":"1","list":[{"content":"聪明伶俐、风姿绰约的保洁阿姨是什么人？","answer":"女人"}]}
     */

    private String status;
    private String msg;
    private ResultBean result;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * total : 58
         * pagenum : 1
         * pagesize : 1
         * list : [{"content":"聪明伶俐、风姿绰约的保洁阿姨是什么人？","answer":"女人"}]
         */

        private String total;
        private String pagenum;
        private String pagesize;
        private List<ListBean> list;

        public String getTotal() {
            return total;
        }

        public void setTotal(String total) {
            this.total = total;
        }

        public String getPagenum() {
            return pagenum;
        }

        public void setPagenum(String pagenum) {
            this.pagenum = pagenum;
        }

        public String getPagesize() {
            return pagesize;
        }

        public void setPagesize(String pagesize) {
            this.pagesize = pagesize;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * content : 聪明伶俐、风姿绰约的保洁阿姨是什么人？
             * answer : 女人
             */

            private String content;
            private String answer;

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getAnswer() {
                return answer;
            }

            public void setAnswer(String answer) {
                this.answer = answer;
            }
        }
    }
}
