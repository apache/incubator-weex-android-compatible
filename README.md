# Abstract
This project services as a compatible library for Android users of Weex. As we rename Java package from `com.taobao.weex` to `org.apache` of [weex_sdk](https://github.com/apache/incubator-weex), users would meet compiling problems if they upgrade to the latest version of weex and still import `com.taobao.weex` in their code.

Therefore, we provide this library for users' convenience without changing their code and still make use of the latest version of Weex.

# Target users
You should not import this library unless the following conditions all meets:
* You are using weex in Android platform.
* You have code dependency for Weex 0.26 or prior.
* You don't want change your code to fit Weex 0.27 at this time.

*New users of Weex should never import this library.*

# Note
This library may be removed or deprecated in the future, please change your code to fit latest `API` of Weex when it's convenience for you.