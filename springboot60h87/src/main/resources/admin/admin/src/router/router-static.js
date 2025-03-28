import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import jiuwujuanzeng from '@/views/modules/jiuwujuanzeng/list'
    import shuxingushi from '@/views/modules/shuxingushi/list'
    import discussxuanchuanxinwen from '@/views/modules/discussxuanchuanxinwen/list'
    import xuanchuanxinwen from '@/views/modules/xuanchuanxinwen/list'
    import youqinglianjie from '@/views/modules/youqinglianjie/list'
    import aixinjuanzeng from '@/views/modules/aixinjuanzeng/list'
    import lejiewomen from '@/views/modules/lejiewomen/list'
    import yonghu from '@/views/modules/yonghu/list'
    import huodongbaoming from '@/views/modules/huodongbaoming/list'
    import chat from '@/views/modules/chat/list'
    import messages from '@/views/modules/messages/list'
    import config from '@/views/modules/config/list'
    import zhiyuanhuodong from '@/views/modules/zhiyuanhuodong/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/jiuwujuanzeng',
        name: '旧物捐赠',
        component: jiuwujuanzeng
      }
      ,{
	path: '/shuxingushi',
        name: '书信故事',
        component: shuxingushi
      }
      ,{
	path: '/discussxuanchuanxinwen',
        name: '宣传新闻评论',
        component: discussxuanchuanxinwen
      }
      ,{
	path: '/xuanchuanxinwen',
        name: '宣传新闻',
        component: xuanchuanxinwen
      }
      ,{
	path: '/youqinglianjie',
        name: '友情链接',
        component: youqinglianjie
      }
      ,{
	path: '/aixinjuanzeng',
        name: '爱心捐赠',
        component: aixinjuanzeng
      }
      ,{
	path: '/lejiewomen',
        name: '了解我们',
        component: lejiewomen
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/huodongbaoming',
        name: '活动报名',
        component: huodongbaoming
      }
      ,{
	path: '/chat',
        name: '在线咨询',
        component: chat
      }
      ,{
	path: '/messages',
        name: '留言求助',
        component: messages
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/zhiyuanhuodong',
        name: '志愿活动',
        component: zhiyuanhuodong
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
