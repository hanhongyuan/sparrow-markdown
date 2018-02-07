package com.sparrow.markdown.parser.impl;

import com.sparrow.markdown.parser.MarkParser;

/**
 * @author harry
 * @date 2018/2/6
 */
public class BoldParser implements MarkParser {
    private String content;

    public BoldParser(String content) {
        this.content = content;
    }

    @Override
    public String parse() {
        return String.format("<span class=\"bold\">%1$s</span>", content);
    }
}