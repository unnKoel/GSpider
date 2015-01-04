package com.snail.spider.tree;

import com.snail.spider.Capture;
import com.snail.spider.knot.Knot;

/**
 * 树
 * 
 * @author zhouyanjun
 * 
 * @date 2013-8-20 上午11:24:28
 * @version V1.0
 */
public interface Tree extends Capture {
	/**
	 * 添加节
	 * 
	 * @param chainKnot
	 */
	public void addChainKnot(Knot<?> treeKnot);

	/**
	 * 删除节
	 * 
	 * @param chainKnot
	 */
	public void removeChainKnot(Knot<?> treeKnot);

	/**
	 * 组装成树
	 * 
	 * @return
	 */
	public Tree assemble();
}
