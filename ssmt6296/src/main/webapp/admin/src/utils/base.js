const base = {
    get() {
                return {
            url : "http://localhost:8080/ssmt6296/",
            name: "ssmt6296",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmt6296/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "校园代购服务订单管理系统"
        } 
    }
}
export default base
