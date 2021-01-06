layui.define(['layer','form'],function (exports) {
    var home = {
        loadIframe: function(url) {
            alert("====" + url);
        }
    };
    exports('home',home);
})