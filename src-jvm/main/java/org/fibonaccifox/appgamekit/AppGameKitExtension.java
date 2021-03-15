package org.fibonaccifox.appgamekit;

import php.runtime.env.CompileScope;
import php.runtime.ext.support.Extension;

public class AppGameKitExtension extends Extension {
    public static final String NS = "fibonaccifox";

    @Override
    public Status getStatus() {
        return Status.EXPERIMENTAL;
    }

    @Override
    public String getName() {
        return "App Game Kit API";
    }

    @Override
    public void onRegister(CompileScope scope) {  
        registerClass(scope, AppGameKitEngine.class);
    }

}