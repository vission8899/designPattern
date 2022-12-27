package com.vission.behavioral.chainOfResponsibility.fluent.handle.impl;

import com.vission.behavioral.chainOfResponsibility.fluent.context.FilterProcessorContext;
import com.vission.behavioral.chainOfResponsibility.fluent.handle.ProcessorAdapter;

public class FirstProcessor extends ProcessorAdapter<FilterProcessorContext> {

    @Override
    public FilterProcessorContext handel(FilterProcessorContext context) {
        String commit = context.getCommit();
        commit = commit.replace("枪", "*");
        return FilterProcessorContext.builder().commit(commit).build();
    }

}
