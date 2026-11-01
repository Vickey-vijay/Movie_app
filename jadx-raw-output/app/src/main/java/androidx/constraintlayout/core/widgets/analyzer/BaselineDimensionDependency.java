package androidx.constraintlayout.core.widgets.analyzer;

/* JADX INFO: loaded from: classes11.dex */
class BaselineDimensionDependency extends DimensionDependency {
    public void update(DependencyNode dependencyNode) {
        WidgetRun widgetRun = this.run;
        ((VerticalWidgetRun) widgetRun).baseline.margin = widgetRun.widget.getBaselineDistance();
        this.resolved = true;
    }

    public BaselineDimensionDependency(WidgetRun widgetRun) {
        super(widgetRun);
    }
}
