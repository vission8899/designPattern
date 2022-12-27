package com.vission.behavioral.chainOfResponsibility.fluent.handle.impl;

import com.vission.behavioral.chainOfResponsibility.fluent.context.ProcessorContext;
import com.vission.behavioral.chainOfResponsibility.fluent.handle.ProcessorAdapter;

public class FirstProcessor extends ProcessorAdapter {

    @Override
    public ProcessorContext handel(ProcessorContext context) {
        String commit = context.getContext().toString();
        commit = commit.replace("枪", "*");
        return ProcessorContext.builder().context(commit).build();
    }

}
