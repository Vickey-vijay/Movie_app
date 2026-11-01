package com.yandex.div.core.expression.local;

import bk.l;
import ck.i;
import com.yandex.div.core.expression.ExpressionsRuntime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.a;
import lk.x;
import mj.h;
import mj.r;

/* JADX INFO: compiled from: RuntimeTree.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class RuntimeTree {
    private final Map<ExpressionsRuntime, RuntimeNode> runtimesToNodes = new LinkedHashMap();
    private final Map<String, RuntimeNode> pathToNodes = new LinkedHashMap();

    /* JADX INFO: compiled from: RuntimeTree.kt */
    public static final class RuntimeNode {
        private final List<RuntimeNode> children;
        private final String path;
        private final ExpressionsRuntime runtime;

        public RuntimeNode(ExpressionsRuntime expressionsRuntime, String str, List<RuntimeNode> list) {
            this.runtime = expressionsRuntime;
            this.path = str;
            this.children = list;
        }

        public final List<RuntimeNode> getChildren() {
            return this.children;
        }

        public final String getPath() {
            return this.path;
        }

        public final ExpressionsRuntime getRuntime() {
            return this.runtime;
        }

        public /* synthetic */ RuntimeNode(ExpressionsRuntime expressionsRuntime, String str, List list, int i10, i iVar) {
            this(expressionsRuntime, str, (i10 & 4) != 0 ? new ArrayList() : list);
        }
    }

    private final void invokeRecursively(RuntimeNode runtimeNode, l<? super RuntimeNode, r> lVar) {
        lVar.invoke(runtimeNode);
        Iterator<T> it = runtimeNode.getChildren().iterator();
        while (it.hasNext()) {
            invokeRecursively((RuntimeNode) it.next(), lVar);
        }
    }

    public final Map<String, ExpressionsRuntime> getPathToRuntimes() {
        Map<String, RuntimeNode> map = this.pathToNodes;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, RuntimeNode> entry : map.entrySet()) {
            arrayList.add(h.a(entry.getKey(), entry.getValue().getRuntime()));
        }
        return a.v(arrayList);
    }

    public final void storeRuntime(ExpressionsRuntime expressionsRuntime, ExpressionsRuntime expressionsRuntime2, String str) {
        RuntimeNode runtimeNode;
        List<RuntimeNode> children;
        RuntimeNode runtimeNode2 = new RuntimeNode(expressionsRuntime, str, null, 4, null);
        this.pathToNodes.put(str, runtimeNode2);
        this.runtimesToNodes.put(expressionsRuntime, runtimeNode2);
        if (expressionsRuntime2 == null || (runtimeNode = this.runtimesToNodes.get(expressionsRuntime2)) == null || (children = runtimeNode.getChildren()) == null) {
            return;
        }
        children.add(runtimeNode2);
    }

    public final void invokeRecursively(ExpressionsRuntime expressionsRuntime, String str, l<? super RuntimeNode, r> lVar) {
        RuntimeNode runtimeNode = this.runtimesToNodes.get(expressionsRuntime);
        if (runtimeNode == null) {
            return;
        }
        if (x.R(runtimeNode.getPath(), str, false, 2, null)) {
            invokeRecursively(runtimeNode, lVar);
            return;
        }
        for (RuntimeNode runtimeNode2 : runtimeNode.getChildren()) {
            if (x.R(runtimeNode2.getPath(), str, false, 2, null)) {
                invokeRecursively(runtimeNode2, lVar);
            }
        }
    }
}
