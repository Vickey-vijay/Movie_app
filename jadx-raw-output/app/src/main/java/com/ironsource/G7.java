package com.ironsource;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public interface G7 {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ArrayList<C5> f26619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f26620b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f26621c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Exception f26622d;

        public a(ArrayList<C5> arrayList) {
            this.f26620b = false;
            this.f26621c = -1;
            this.f26619a = arrayList;
        }

        public a a(Exception exc) {
            return new a(this.f26619a, this.f26621c, this.f26620b, exc);
        }

        public a a(boolean z10) {
            return new a(this.f26619a, this.f26621c, z10, this.f26622d);
        }

        public ArrayList<C5> b() {
            return this.f26619a;
        }

        public boolean c() {
            return this.f26620b;
        }

        public String toString() {
            return "EventSendResult{success=" + this.f26620b + ", responseCode=" + this.f26621c + ", exception=" + this.f26622d + '}';
        }

        public a a(int i10) {
            return new a(this.f26619a, i10, this.f26620b, this.f26622d);
        }

        public String a() {
            if (this.f26620b) {
                return "";
            }
            return "rc=" + this.f26621c + ", ex=" + this.f26622d;
        }

        public a(ArrayList<C5> arrayList, int i10, boolean z10, Exception exc) {
            this.f26619a = arrayList;
            this.f26620b = z10;
            this.f26622d = exc;
            this.f26621c = i10;
        }
    }

    void a(a aVar);
}
