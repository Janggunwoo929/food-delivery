
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OrderManager from "./components/listers/OrderCards"
import OrderDetail from "./components/listers/OrderDetail"

import SelectMenuView from "./components/SelectMenuView"
import SelectMenuViewDetail from "./components/SelectMenuViewDetail"
import StoreManager from "./components/listers/StoreCards"
import StoreDetail from "./components/listers/StoreDetail"

import NotifyManager from "./components/listers/NotifyCards"
import NotifyDetail from "./components/listers/NotifyDetail"

import RiderManager from "./components/listers/RiderCards"
import RiderDetail from "./components/listers/RiderDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/orders',
                name: 'OrderManager',
                component: OrderManager
            },
            {
                path: '/orders/:id',
                name: 'OrderDetail',
                component: OrderDetail
            },

            {
                path: '/selectMenus',
                name: 'SelectMenuView',
                component: SelectMenuView
            },
            {
                path: '/selectMenus/:id',
                name: 'SelectMenuViewDetail',
                component: SelectMenuViewDetail
            },
            {
                path: '/stores',
                name: 'StoreManager',
                component: StoreManager
            },
            {
                path: '/stores/:id',
                name: 'StoreDetail',
                component: StoreDetail
            },

            {
                path: '/notifies',
                name: 'NotifyManager',
                component: NotifyManager
            },
            {
                path: '/notifies/:id',
                name: 'NotifyDetail',
                component: NotifyDetail
            },

            {
                path: '/riders',
                name: 'RiderManager',
                component: RiderManager
            },
            {
                path: '/riders/:id',
                name: 'RiderDetail',
                component: RiderDetail
            },



    ]
})
