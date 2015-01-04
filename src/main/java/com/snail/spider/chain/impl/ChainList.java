package com.snail.spider.chain.impl;

import java.util.List;
import com.snail.spider.chain.Chain;
import com.snail.spider.knot.Knot;

/**
 * 爬取链
 * 
 * @author zhouyanjun
 * 
 * @date 2013-8-19 下午6:07:30
 * @version V1.0
 */
public class ChainList implements Chain {
	private List<Knot> chainKnots;

	/**
	 * 添加一个链节
	 * 
	 * @param chainKnot
	 */
	public void addChainKnot(Knot chainKnot) {
		chainKnots.add(chainKnot);
	}

	/**
	 * 删除一个链节
	 * 
	 * @param chainKnot
	 */
	public void removeChainKnot(Knot chainKnot) {
		chainKnots.remove(chainKnot);
	}

	/**
	 * 组装
	 * 
	 * @return
	 */
	public ChainList assemble() {
		for (int i = chainKnots.size() - 1; i > 0; i--) {
			chainKnots.get(i).setFrontLinkPoint(chainKnots.get(i - 1).getBackLinkPoint());
		}
		return this;
	}

	/**
	 * 启动（链子转动）
	 * 
	 * @throws Exception
	 */
	public void launch() throws Exception {
		for (Knot chainKnot : chainKnots) {
			chainKnot.launch();
		}
	}

	/**
	 * 停止（停止转动）
	 */
	public void stop() {
		for (Knot chainKnot : chainKnots) {
			chainKnot.stop();
		}
	}
}
