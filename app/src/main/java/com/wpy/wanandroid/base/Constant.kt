package com.wpy.wanandroid.base

class Constant {


    companion object {
        const val WAN_ANDROID_URL = "https://www.wanandroid.com/"
        const val HTTP_TIMEOUT: Long = 10
        const val REFRESH_TIMEOUT: Int = 10 * 1000

        //网络交互Logger子Tag
        const val NET_LOG_TAG = "网络日志"
        const val NET_REQUEST_HEADER = "请求头信息------------->%s"
        const val NET_REQUEST_STRING = "发起请求： 请求方式 = %s\n请求url = %s\n请求体 = %s"
        const val NET_RESPONSE_HEADER = "响应头信息------------->%s"
        const val NET_RESPONSE_SUCESS_STRING = "{\"响应状态\":\"成功\", \"对应请求\":\"%s\",\"响应体\" : %s}"
        const val NET_RESPONSE_FAIL_STRING = "响应失败： 对应请求url = %s\n异常信息 = %s"
        const val NET_EXCEPTION_STRING = "响应异常：异常信息 = %s"
        const val HTTP_CACHE = "HttpCache"
    }
}