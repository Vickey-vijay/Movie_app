package androidx.constraintlayout.core.widgets.analyzer;

/* JADX INFO: loaded from: classes8.dex */
class DimensionDependency extends DependencyNode {
    public int wrapValue;

    @Override // androidx.constraintlayout.core.widgets.analyzer.DependencyNode
    public void resolve(int i10) {
        if (this.resolved) {
            return;
        }
        this.resolved = true;
        this.value = i10;
        for (Dependency dependency : this.dependencies) {
            dependency.update(dependency);
        }
    }

    public DimensionDependency(WidgetRun widgetRun) {
        super(widgetRun);
        if (widgetRun instanceof HorizontalWidgetRun) {
            this.type = DependencyNode.Type.HORIZONTAL_DIMENSION;
        } else {
            this.type = DependencyNode.Type.VERTICAL_DIMENSION;
        }
    }
}
