package com.muskteer.dico.engine.proxy.cutpoint.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.muskteer.dico.engine.inner.Dico;
import com.muskteer.dico.engine.proxy.cutpoint.CutPointInterceptor;

public class AfterInterceptor implements CutPointInterceptor {

    @Override
    public void execute(Object obj) {
        Dico col = (Dico) obj;
        System.out.println("[" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + "]"
                + "{execute sql end.}{sql content:" + col.getCurrSql().getSql() + "}");
    }

}