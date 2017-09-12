package com.vladsch.flexmark.docx.converter.util;

import org.docx4j.wml.RPr;

public class BoldRunFormatProvider<T> extends RunFormatProviderBase<T> {
    public BoldRunFormatProvider(final DocxContext<T> docx) {
        super(docx, RunFormatProvider.BOLD_STYLE);
    }

    @Override
    public void getRPr(final RPr rPr) {
        super.getRPr(rPr);
        //rPr.setB(docx.getBooleanDefaultTrue());
        //rPr.setBCs(docx.getBooleanDefaultTrue());
    }
}
