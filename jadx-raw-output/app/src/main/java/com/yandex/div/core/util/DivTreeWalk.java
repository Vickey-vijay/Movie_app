package com.yandex.div.core.util;

import bk.l;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import java.util.Iterator;
import java.util.List;
import kk.i;
import mj.r;
import nj.c;

/* JADX INFO: compiled from: DivTreeWalk.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivTreeWalk implements i<DivItemBuilderResult> {
    private final int maxDepth;
    private final l<Div, Boolean> onEnter;
    private final l<Div, r> onLeave;
    private final ExpressionResolver resolver;
    private final Div root;

    /* JADX INFO: compiled from: DivTreeWalk.kt */
    public static final class BranchNode implements Node {
        private int childIndex;
        private List<DivItemBuilderResult> children;
        private final DivItemBuilderResult item;
        private final l<Div, Boolean> onEnter;
        private final l<Div, r> onLeave;
        private boolean rootVisited;

        @Override // com.yandex.div.core.util.DivTreeWalk.Node
        public DivItemBuilderResult getItem() {
            return this.item;
        }

        @Override // com.yandex.div.core.util.DivTreeWalk.Node
        public DivItemBuilderResult step() {
            if (!this.rootVisited) {
                l<Div, Boolean> lVar = this.onEnter;
                boolean z10 = false;
                if (lVar != null && !lVar.invoke(getItem().getDiv()).booleanValue()) {
                    z10 = true;
                }
                if (z10) {
                    return null;
                }
                this.rootVisited = true;
                return getItem();
            }
            List<DivItemBuilderResult> items = this.children;
            if (items == null) {
                items = DivTreeWalkKt.getItems(getItem().getDiv(), getItem().getExpressionResolver());
                this.children = items;
            }
            if (this.childIndex < items.size()) {
                int i10 = this.childIndex;
                this.childIndex = i10 + 1;
                return items.get(i10);
            }
            l<Div, r> lVar2 = this.onLeave;
            if (lVar2 == null) {
                return null;
            }
            lVar2.invoke(getItem().getDiv());
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public BranchNode(DivItemBuilderResult divItemBuilderResult, l<? super Div, Boolean> lVar, l<? super Div, r> lVar2) {
            this.item = divItemBuilderResult;
            this.onEnter = lVar;
            this.onLeave = lVar2;
        }
    }

    /* JADX INFO: compiled from: DivTreeWalk.kt */
    public final class DivTreeWalkIterator extends c<DivItemBuilderResult> {
        private final ExpressionResolver resolver;
        private final Div root;
        private final nj.i<Node> stack;

        public DivTreeWalkIterator(Div div, ExpressionResolver expressionResolver) {
            this.root = div;
            this.resolver = expressionResolver;
            nj.i<Node> iVar = new nj.i<>();
            iVar.addLast(node(DivCollectionExtensionsKt.toItemBuilderResult(div, expressionResolver)));
            this.stack = iVar;
        }

        private final DivItemBuilderResult nextItem() {
            Node nodeM = this.stack.m();
            if (nodeM == null) {
                return null;
            }
            DivItemBuilderResult divItemBuilderResultStep = nodeM.step();
            if (divItemBuilderResultStep == null) {
                this.stack.removeLast();
                return nextItem();
            }
            if (divItemBuilderResultStep == nodeM.getItem() || DivUtilKt.isLeaf(divItemBuilderResultStep.getDiv()) || this.stack.size() >= DivTreeWalk.this.maxDepth) {
                return divItemBuilderResultStep;
            }
            this.stack.addLast(node(divItemBuilderResultStep));
            return nextItem();
        }

        private final Node node(DivItemBuilderResult divItemBuilderResult) {
            if (DivUtilKt.isBranch(divItemBuilderResult.getDiv())) {
                return new BranchNode(divItemBuilderResult, DivTreeWalk.this.onEnter, DivTreeWalk.this.onLeave);
            }
            return new LeafNode(divItemBuilderResult);
        }

        @Override // nj.c
        public void computeNext() {
            DivItemBuilderResult divItemBuilderResultNextItem = nextItem();
            if (divItemBuilderResultNextItem != null) {
                setNext(divItemBuilderResultNextItem);
            } else {
                done();
            }
        }
    }

    /* JADX INFO: compiled from: DivTreeWalk.kt */
    public static final class LeafNode implements Node {
        private final DivItemBuilderResult item;
        private boolean visited;

        @Override // com.yandex.div.core.util.DivTreeWalk.Node
        public DivItemBuilderResult getItem() {
            return this.item;
        }

        @Override // com.yandex.div.core.util.DivTreeWalk.Node
        public DivItemBuilderResult step() {
            if (this.visited) {
                return null;
            }
            this.visited = true;
            return getItem();
        }

        public LeafNode(DivItemBuilderResult divItemBuilderResult) {
            this.item = divItemBuilderResult;
        }
    }

    /* JADX INFO: compiled from: DivTreeWalk.kt */
    public interface Node {
        DivItemBuilderResult getItem();

        DivItemBuilderResult step();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private DivTreeWalk(Div div, ExpressionResolver expressionResolver, l<? super Div, Boolean> lVar, l<? super Div, r> lVar2, int i10) {
        this.root = div;
        this.resolver = expressionResolver;
        this.onEnter = lVar;
        this.onLeave = lVar2;
        this.maxDepth = i10;
    }

    @Override // kk.i
    public Iterator<DivItemBuilderResult> iterator() {
        return new DivTreeWalkIterator(this.root, this.resolver);
    }

    public final DivTreeWalk onEnter(l<? super Div, Boolean> lVar) {
        return new DivTreeWalk(this.root, this.resolver, lVar, this.onLeave, this.maxDepth);
    }

    public final DivTreeWalk onLeave(l<? super Div, r> lVar) {
        return new DivTreeWalk(this.root, this.resolver, this.onEnter, lVar, this.maxDepth);
    }

    public /* synthetic */ DivTreeWalk(Div div, ExpressionResolver expressionResolver, l lVar, l lVar2, int i10, int i11, ck.i iVar) {
        this(div, expressionResolver, lVar, lVar2, (i11 & 16) != 0 ? Integer.MAX_VALUE : i10);
    }

    public DivTreeWalk(Div div, ExpressionResolver expressionResolver) {
        this(div, expressionResolver, null, null, 0, 16, null);
    }
}
