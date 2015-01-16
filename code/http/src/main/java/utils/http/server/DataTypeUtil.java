package utils.http.server;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 关于数据类型处理的类
 * <p>
 * wjz,0226,增加findMapValueByKey方法
 * 
 * @author william
 * @created 2003年8月31日
 */
public final class DataTypeUtil {
	private static final Logger logger = LoggerFactory.getLogger("DataTypeUtil");

	// 把字符串用MD5加密
	public static String MD5(String src) {
		MessageDigest md = null;
		String des = "";
		try {
			md = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			logger.error("MD5 error" + e.getMessage());
		}
		md.update(src.getBytes());
		byte[] b = md.digest();
		des = bytes2Hexs(b);
		return des;
	}
	
	
	public static byte[] MD54Bytes(String src) {
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			logger.error("MD5 error" + e.getMessage());
		}
		md.update(src.getBytes());
		byte[] b = md.digest();
		return b;
	}

	/**
	 * 将字节数组转换为16进制字符串如 {10,-1}-->0aFF
	 * 
	 * @param src
	 *            源数组
	 * @return 字符串,null表示失败
	 * @roseuid 3C15CF9502F8
	 */
	public static String bytes2Hexs(byte[] src) {

		StringBuffer hs = new StringBuffer();
		String stmp = "";
		hs.setLength(src.length * 2);
		int t = 0;
		try {

			for (int n = 0; n < src.length; n++) {
				stmp = (java.lang.Integer.toHexString(src[n] & 0XFF));
				if (stmp.length() == 1) {
					hs.setCharAt(t, '0');
					t++;
					hs.setCharAt(t, stmp.charAt(0));
					t++;
				} else {
					hs.setCharAt(t, stmp.charAt(0));
					t++;
					hs.setCharAt(t, stmp.charAt(1));
					t++;
				}
			}
		}
		// try
		catch (java.lang.NullPointerException ex) {
			return null;
		}
		String strTemp = hs.toString().toUpperCase();
		hs = null;
		return strTemp;
	}
}
