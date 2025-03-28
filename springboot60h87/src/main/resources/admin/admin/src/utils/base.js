const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot60h87/",
            name: "springboot60h87",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot60h87/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "留守儿童爱心网站"
        } 
    }
}
export default base
