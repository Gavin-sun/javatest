package com.company.demo_File;

import java.io.File;
import java.io.FileFilter;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/18 11:06
 *
 * 创建过滤器FileFilter的实现类 重写过滤器方法accept 定义过滤规则
 */
public class FileFilterImpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        if(pathname.isDirectory()) return true;
        return pathname.getName().toLowerCase().endsWith(".class");
    }
}
