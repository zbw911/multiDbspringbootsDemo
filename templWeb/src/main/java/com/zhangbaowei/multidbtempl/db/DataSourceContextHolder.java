package com.zhangbaowei.multidbtempl.db;


public class DataSourceContextHolder {
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();
    //设置默认数据源
    public static String DEFAULT_DS = "";

    public static void setetDefaultDS(String defaultds) {
        DEFAULT_DS = defaultds;
    }

    public static String getDs() {
        return contextHolder.get();
    }

    public static void setDs(String dstype) {
        contextHolder.set(dstype);
    }

    public static void cleanDs() {
        contextHolder.remove();
    }

}
