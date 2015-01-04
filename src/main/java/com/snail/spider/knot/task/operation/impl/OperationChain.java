package com.snail.spider.knot.task.operation.impl;

import com.snail.spider.knot.task.operation.OperationCollection;
import com.snail.spider.knot.task.operationcollection.SourceCodeAnalyserProcessor;
import com.snail.spider.knot.task.operationcollection.SourceCodeReadProcessor;
import com.snail.spider.knot.task.operationcollection.TerminalProcessor;

/**
 * 操作链
 * 
 * @author zhouyanjun
 * 
 * @date 2013-8-19 下午7:38:06
 * @version V1.0
 * @param <T>
 */
public class OperationChain<E, T> implements OperationCollection<T> {
	private TerminalProcessor<E, T> headerProcessor;
	private SourceCodeReadProcessor<T> sourceCodeReadProcessor;
	private SourceCodeAnalyserProcessor<T> sourceCodeAnalyserProcessor;
	private TerminalProcessor<E, T> tailProcessor;

	public void doOperation(T Operator) throws Exception {
		headerProcessor.doOperation(Operator); // 头操作
		sourceCodeReadProcessor.doOperation(Operator);// 读源码
		sourceCodeAnalyserProcessor.doOperation(Operator); // 分析
		tailProcessor.doOperation(Operator);// 尾操作
	}

	public TerminalProcessor<E, T> getHeaderProcessor() {
		return headerProcessor;
	}

	public void setHeaderProcessor(TerminalProcessor<E, T> headerProcessor) {
		this.headerProcessor = headerProcessor;
	}

	public SourceCodeReadProcessor<T> getSourceCodeReadProcessor() {
		return sourceCodeReadProcessor;
	}

	public void setSourceCodeReadProcessor(SourceCodeReadProcessor<T> sourceCodeReadProcessor) {
		this.sourceCodeReadProcessor = sourceCodeReadProcessor;
	}

	public SourceCodeAnalyserProcessor<T> getSourceCodeAnalyserProcessor() {
		return sourceCodeAnalyserProcessor;
	}

	public void setSourceCodeAnalyserProcessor(SourceCodeAnalyserProcessor<T> sourceCodeAnalyserProcessor) {
		this.sourceCodeAnalyserProcessor = sourceCodeAnalyserProcessor;
	}

	public TerminalProcessor<E, T> getTailProcessor() {
		return tailProcessor;
	}

	public void setTailProcessor(TerminalProcessor<E, T> tailProcessor) {
		this.tailProcessor = tailProcessor;
	}

	public static void main(String[] args) throws Exception {
		// Page page = new Page();
		// OperationChain<Page> operationChain = new OperationChain<Page>();
		// TerminalProcessor<Page> headProByPage = new
		// TerminalProcessorByPage<Page>();
		// page.setOperation(operationChain);
		// // page.getOperation().doOperation(page);
		// operationChain.setHeaderProcessor(headProByPage);
		// try {
		// operationChain.doOperation(page);
		// } catch (Exception e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
	}
}
