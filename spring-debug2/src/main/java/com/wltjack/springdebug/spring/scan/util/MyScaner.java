package com.wltjack.springdebug.spring.scan.util;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.io.File;
import java.util.*;

/**
 * 扫描模拟
 *
 * @author wltjack
 * Created at 2023/3/5 22:03
 */
public class MyScaner {

	File file = new File(this.getClass().getResource("/").getPath());

	public List<String> nameList = new ArrayList<>();
	public Map<String, AbstractBeanDefinition> map = new HashMap<>();


	/**
	 * 模拟Spring完成了扫描符合规则的Bean
	 * listName存储所有符合规则的bean的名字
	 * map存储所有符合规则的bean的名字和与之对应的bd
	 *
	 * @param packageName 包名
	 */
	public void scan(String packageName) throws ClassNotFoundException {
		String scanPath = "";
		// 类的存放路径
		String rootPath = file.getPath();
		scanPath = packageName.replaceAll("\\.", "\\\\");
		rootPath = rootPath + File.separator + scanPath;
		List<String> fileNameList = new ArrayList<>();
		readFile(rootPath, fileNameList);
		String[] list = StringUtils.toStringArray(fileNameList);

		if (list != null && list.length > 0) {
			for (String s : list) {
				s = s.replaceAll(".class", "");
				String beanName = s.toLowerCase();
				s = packageName + "." + s;
				Class<?> aClass = Class.forName(s);

				if (aClass.isAnnotationPresent(Component.class)) {
					GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
					beanDefinition.setBeanClass(aClass);
					if (aClass.isAnnotationPresent(Scope.class)) {
						beanDefinition.setScope(aClass.getAnnotation(Scope.class).value());
					}

					map.put(beanName, beanDefinition);
					nameList.add(beanName);
				}
			}
		}

	}


	/**
	 * 迭代读取文件夹下所有子文件或者文件夹
	 *
	 * @param path 文件夹路径
	 */
	public void readFile(String path, List<String> fileNameList) {
		File file = new File(path);
		File[] tempList = Optional.ofNullable(file.listFiles()).orElse(new File[]{});
		//tempList.length获取文件夹下所包含的文件或者文件夹的个数
		if (tempList.length > 0) {
			for (File f : tempList) {
				//如果是文件，直接打印文件名称
				if (f.isFile()) {
					fileNameList.add(f.getName());
				}
				if (f.isDirectory()) {
					readFile(path + "/" + f.getName(), fileNameList);
				}
			}
		}
	}


	public List<String> getNameList() {
		return nameList;
	}

	public Map<String, AbstractBeanDefinition> getMap() {
		return map;
	}
}
