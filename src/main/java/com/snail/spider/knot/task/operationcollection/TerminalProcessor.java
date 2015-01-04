package com.snail.spider.knot.task.operationcollection;

import com.snail.spider.knot.linkpoint.LinkPoint;
import com.snail.spider.knot.task.operation.Operation;

public abstract class TerminalProcessor<E, T> implements Operation<T> {
	private LinkPoint<E> terminalLinkPoint;

	public LinkPoint<E> getTerminalLinkPoint() {
		return terminalLinkPoint;
	}

	public void setTerminalLinkPoint(LinkPoint<E> terminalLinkPoint) {
		this.terminalLinkPoint = terminalLinkPoint;
	}
}
