const base = {
    get() {
        return {
            url : "http://localhost:8080/luodingchicken/",
            name: "luodingchicken",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/luodingchicken/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "罗定市豆豉鸡养殖技术推广平台"
        } 
    }
}
export default base
