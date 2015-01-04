package com.snail.spider.tree.impl;

import java.util.Map;

import com.snail.spider.knot.Knot;
import com.snail.spider.tree.Tree;

/**
 * 简单树
 * 
 * @author zhouyanjun
 * 
 * @date 2013-8-20 下午2:01:49
 * @version V1.0
 */
public class TreeMap implements Tree {
	private Knot root; // 根节点
	private Map<Integer, Knot> treeMap; // 子节点

	public TreeMap(Knot root, Map<Integer, Knot> treeMap) {
		super();
		this.root = root;
		this.treeMap = treeMap;
	}

	public void addChainKnot(Knot treeKnot) {
		treeMap.put(treeKnot.getFrontLinkPoint().getLPointIndex(), treeKnot);
		treeMap.put(treeKnot.getBackLinkPoint().getLPointIndex(), treeKnot);
	}

	public void removeChainKnot(Knot treeKnot) {
		treeMap.remove(treeKnot.getFrontLinkPoint().getLPointIndex());
		treeMap.remove(treeKnot.getBackLinkPoint().getLPointIndex());
	}

	public Tree assemble() {
		for (Integer pointIndex : treeMap.keySet()) {

		}
		return null;
	}

	public void launch() throws Exception {

	}

	public void stop() {

	}
}
