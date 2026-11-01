package com.yandex.div.core;

import android.content.Context;
import androidx.annotation.AnyThread;
import ck.i;
import com.yandex.div.core.dagger.DivKitComponent;
import com.yandex.div.core.dagger.Yatagan$DivKitComponent;

/* JADX INFO: compiled from: DivKit.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivKit {
    public static final Companion Companion = new Companion(null);
    private static final DivKitConfiguration DEFAULT_CONFIGURATION = new DivKitConfiguration.Builder().build();
    private static DivKitConfiguration configuration;
    private static volatile DivKit instance;
    private final DivKitComponent component;

    private DivKit(Context context, DivKitConfiguration divKitConfiguration) {
        this.component = Yatagan$DivKitComponent.builder().applicationContext(context.getApplicationContext()).configuration(divKitConfiguration).build();
    }

    public /* synthetic */ DivKit(Context context, DivKitConfiguration divKitConfiguration, i iVar) {
        this(context, divKitConfiguration);
    }

    /* JADX INFO: compiled from: DivKit.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final String getVersionName() {
            return "32.18.1";
        }

        @AnyThread
        public final DivKit getInstance(Context context) {
            DivKit divKit = DivKit.instance;
            if (divKit != null) {
                return divKit;
            }
            synchronized (this) {
                DivKit divKit2 = DivKit.instance;
                if (divKit2 == null) {
                    DivKitConfiguration divKitConfiguration = DivKit.configuration;
                    if (divKitConfiguration == null) {
                        divKitConfiguration = DivKit.DEFAULT_CONFIGURATION;
                    }
                    DivKit divKit3 = new DivKit(context, divKitConfiguration, null);
                    DivKit.instance = divKit3;
                    return divKit3;
                }
                return divKit2;
            }
        }
    }

    public final DivKitComponent getComponent$div_release() {
        return this.component;
    }
}
