package com.snail.spider.chain;

import com.snail.spider.Capture;
import com.snail.spider.chain.impl.ChainList;
import com.snail.spider.knot.Knot;

/**
 * 链
 * 
 * @author zhouyanjun
 * 
 * @date 2013-8-20 上午11:20:56
 * @version V1.0
 */
public interface Chain extends Capture {
	/**
	 * 添加节
	 * 
	 * @param chainKnot
	 */
	public void addChainKnot(Knot<?> chainKnot);

	/**
	 * 删除节
	 * 
	 * @param chainKnot
	 */
	public void removeChainKnot(Knot<?> chainKnot);

	/**
	 * 组装成链
	 * 
	 * @return
	 */
	public ChainList assemble();
}
