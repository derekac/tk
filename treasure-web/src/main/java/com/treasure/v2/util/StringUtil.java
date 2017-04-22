package com.treasure.v2.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 字符串工具类
 * @author wb
 *
 */
public class StringUtil {
	private static SimpleDateFormat sdf_YYYY_MM_DD = new SimpleDateFormat("yyyy-MM-dd");
	private static SimpleDateFormat sdf_yyyyMMddHHmmss = new SimpleDateFormat("yyyyMMddHHmmss");
	/**
	 * 判断字符串是否为空或空串
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str){
		return str==null||str.trim().length()==0;
	}
	
	/**
	 * 替换需要放入json属性值中的回车、单引号、双引号
	 * @param msg
	 * @return
	 */
	public static String replaceSpecialCharactersForJson(String msg){
		return msg.replace("\n","\\n").replace("'","\\'").replace("\"","\\\"");
	}
	
	/**
	 * 严格按照yyy-MM-dd格式检验时间
	 * @param date
	 * @return
	 */
	public static  boolean checkSimpleDateYYYY_MM_DD(String date){
		if(date!=null){
			try {
				sdf_YYYY_MM_DD.setLenient(false);
				sdf_YYYY_MM_DD.parse(date);
			} catch (ParseException e) {
				return false;
			}
				return true;
			}
		return false;
	}
	
	private static int seq = 10;
	
	private static int getSeq(){
		seq++;
		if (seq>=100){
			seq=10;
		}
		return seq;
	}
	
	
	public static String getUploadFileName(){
		return sdf_yyyyMMddHHmmss.format(new Date())+getSeq();
	}
	
	/**
	 * 判断对象是否是数字 double 类型，没有小数点的数字也是 double 类型
	 * 
	 * @param obj
	 * @return
	 * 				如果是 double 类型，返回true，否则返回 false
	 */
	public static boolean isDouble(String obj)
	{
		return !isEmpty(obj) && obj.matches("(^[0-9]+\\.[0-9]+|([0-9]+$))"); 
	}
	
	/**
	 * 判断对象是否是数字类型
	 * @param obj
	 * @return
	 * 				字符串对象是数字类型返回 true，否则返回 false
	 */
	public static boolean isNumber(String obj)
	{
		return !isEmpty(obj) && obj.matches("^[0-9]+$");
	}
	
	/**
	 * 判断 {@code obj}是否为固定长度的数字
	 * @param obj
	 * 				判断的字符串
	 * @param len
	 * 				数字长度
	 * @return
	 */
	public static boolean isNumber(String obj, int len)
	{
		return !isEmpty(obj) && obj.matches("^[0-9]{" + len + "}$"); 
	}
	
}