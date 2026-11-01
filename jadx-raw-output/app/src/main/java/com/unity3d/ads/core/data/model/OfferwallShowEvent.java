package com.unity3d.ads.core.data.model;

import ck.i;

/* JADX INFO: compiled from: OfferwallShowEvent.kt */
/* JADX INFO: loaded from: classes11.dex */
public abstract class OfferwallShowEvent {

    /* JADX INFO: compiled from: OfferwallShowEvent.kt */
    public static final class Show extends OfferwallShowEvent {
        public static final Show INSTANCE = new Show();

        private Show() {
            super(null);
        }
    }

    private OfferwallShowEvent() {
    }

    public /* synthetic */ OfferwallShowEvent(i iVar) {
        this();
    }
}
