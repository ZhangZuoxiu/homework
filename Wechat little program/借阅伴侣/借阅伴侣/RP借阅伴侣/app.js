//app.js
App({
  onLaunch: function () {
    /*var that = this;
    
    //检查登录态
    wx.checkSession({
      success: function () {
        console.log("未过期");
        //获取缓存中的数据
        wx.getStorage({
          key: 'globalData',
          success: function (res) {
            // console.log(res.data);
            that.globalData = res.data;
          },
          fail: function (res) {
          },
          complete: function (res) {
          }
        })
      },
      fail: function () {
        console.log("过期");
        //过期重新登录
        that.login();
      }
    })*/
  },
  //登录 授权
  login: function (cb) {
    var that = this;
    //登录
    wx.login({
      success: function (res) {

        var code = res.code;
        var url = 'https://api.weixin.qq.com/sns/jscode2session?appid=wxf9d1f5e8bde0b086&secret=e48507472505824103ba568b724c6a9b&js_code=' + code + '&grant_type=authorization_code';

        //获取用户信息
        wx.getUserInfo({
          success: function (res) {

            //登录成功,接受授权后  获取openid
            wx.request({
              url: url,
              data: {},
              method: 'GET',
              success: function (res) {

                //获取openid 赋值
                that.globalData.userID = res.data.openid;
                that.globalData.power = true;
                that.globalData.mineSH0 = "show";
                that.globalData.mineSH1 = "hidden";

                typeof cb == "function" && cb(that.globalData)
                wx.setStorage({
                  key: 'globalData',
                  data: that.globalData,
                  success: function (res) {
                    console.log("缓存成功", that.globalData);
                  },
                  fail: function (res) {
                  },
                  complete: function (res) {
                  }
                })

              },
              fail: function (res) {
              },
              complete: function (res) {
              }
            })
          },
          fail: function () {
            that.globalData.power = false;
            that.globalData.mineSH0 = "hidden";
            that.globalData.mineSH1 = "show";
            typeof cb == "function" && cb(that.globalData)

            wx.showModal({
              title: '提示',
              content: '您拒绝了授权，将无法享受更多功能',
              showCancel: false,
              success: function (res) {
              }
            })

          }
        })
      },
      fail: function () {
        wx.showModal({
          title: '提示',
          content: '系统错误，稍后重试',
          showCancel: false,
          success: function (res) {
          }
        })
      },
      complete: function (res) {
      }
    })
  },
  //全局变量
  globalData: {
    power: null, //用户是否授权
    userID: null, //用户ID
    mineSH0: null, //mine页面 信息显示
    mineSH1: null //mine页面 登录按钮显示
  }

})