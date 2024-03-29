package com.vission.behavioral.chainOfResponsibility;

import com.vission.behavioral.chainOfResponsibility.fluent.FilterProcessorExecute;
import com.vission.behavioral.chainOfResponsibility.fluent.context.FilterProcessorContext;
import com.vission.behavioral.chainOfResponsibility.fluent.strategy.FilterOrderStrategy;

/**
 * 责任链模式 + 策略模式 + 适配器模式
 *
 * @author vission
 */
public class Main {

    /**
     * 评论过滤禁词
     *
     * @param args 参数
     */
    public static void main(String[] args) {
        String commit = "枪+炮=死";
        FilterProcessorContext context = FilterProcessorContext.builder().commit(commit).build();
        String result = new FilterProcessorExecute().execute(context, new FilterOrderStrategy()).getCommit();
        System.out.println(result);
//      lambda表达式写法
//        new ProcessorExecute() {
//            @Override
//            public ProcessorContext execute(ProcessorContext context, Strategy strategy) {
//                return null;
//            }
//        };
//        ProcessorExecute<FilterProcessorContext, FilterOrderStrategy> execute = (a,b)-> null;
    }

}
