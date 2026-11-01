package com.yandex.div.core.view2.divs;

import android.view.View;
import bk.l;
import com.yandex.div.core.DecodeBase64ImageTask;
import com.yandex.div.core.expression.variables.TwoWayIntegerVariableBinder;
import com.yandex.div.core.expression.variables.TwoWayVariableBinder;
import com.yandex.div.core.player.DivPlayer;
import com.yandex.div.core.player.DivPlayerFactory;
import com.yandex.div.core.player.DivPlayerPlaybackConfig;
import com.yandex.div.core.player.DivPlayerView;
import com.yandex.div.core.player.DivVideoSource;
import com.yandex.div.core.player.DivVideoViewMapper;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.util.ImageRepresentation;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.widgets.DivVideoView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivVideo;
import com.yandex.div2.DivVideoScale;
import java.util.List;
import java.util.concurrent.ExecutorService;
import mj.r;

/* JADX INFO: compiled from: DivVideoBinder.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivVideoBinder extends DivViewBinder<Div.r, DivVideo, DivVideoView> {
    private final DivActionBinder divActionBinder;
    private final ExecutorService executorService;
    private final DivPlayerFactory playerFactory;
    private final TwoWayIntegerVariableBinder variableBinder;
    private final DivVideoViewMapper videoViewMapper;

    private final void applyPreview(DivVideo divVideo, ExpressionResolver expressionResolver, l<? super ImageRepresentation, r> lVar) {
        Expression<String> expression = divVideo.B;
        String strEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        if (strEvaluate == null) {
            lVar.invoke(null);
        } else {
            this.executorService.submit(new DecodeBase64ImageTask(strEvaluate, false, lVar));
        }
    }

    private final void observeElapsedTime(DivVideoView divVideoView, DivVideo divVideo, BindingContext bindingContext, final DivPlayer divPlayer, DivStatePath divStatePath) {
        String str = divVideo.f49996m;
        if (str == null) {
            return;
        }
        divVideoView.addSubscription(this.variableBinder.bindVariable(bindingContext, str, new TwoWayVariableBinder.Callbacks() { // from class: com.yandex.div.core.view2.divs.DivVideoBinder$observeElapsedTime$callbacks$1
            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void onVariableChanged(Long l10) {
                if (l10 != null) {
                    DivPlayer divPlayer2 = divPlayer;
                    l10.longValue();
                    divPlayer2.seek(l10.longValue());
                }
            }

            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void setViewStateChangeListener(final l<? super Long, r> lVar) {
                divPlayer.addObserver(new DivPlayer.Observer() { // from class: com.yandex.div.core.view2.divs.DivVideoBinder$observeElapsedTime$callbacks$1$setViewStateChangeListener$1
                });
            }
        }, divStatePath));
    }

    private final void observeMuted(DivVideoView divVideoView, DivVideo divVideo, ExpressionResolver expressionResolver, final DivPlayer divPlayer) {
        divVideoView.addSubscription(divVideo.f50006w.observeAndGet(expressionResolver, new l<Boolean, r>() { // from class: com.yandex.div.core.view2.divs.DivVideoBinder.observeMuted.1
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return r.f64562a;
            }

            public final void invoke(boolean z10) {
                divPlayer.setMuted(z10);
            }
        }));
    }

    private final void observeScale(DivVideoView divVideoView, DivVideo divVideo, ExpressionResolver expressionResolver, final DivPlayerView divPlayerView, final PreviewImageView previewImageView) {
        divVideoView.addSubscription(divVideo.G.observeAndGet(expressionResolver, new l<DivVideoScale, r>() { // from class: com.yandex.div.core.view2.divs.DivVideoBinder.observeScale.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(DivVideoScale divVideoScale) {
                invoke2(divVideoScale);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DivVideoScale divVideoScale) {
                divPlayerView.setScale(divVideoScale);
                previewImageView.setScale(divVideoScale);
            }
        }));
    }

    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(DivVideoView divVideoView, BindingContext bindingContext, DivVideo divVideo, DivVideo divVideo2, DivStatePath divStatePath) {
        PreviewImageView previewImageView;
        final DivPlayerView divPlayerView;
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        List<DivVideoSource> listCreateSource = DivVideoBinderKt.createSource(divVideo, expressionResolver);
        DivPlayerPlaybackConfig divPlayerPlaybackConfig = new DivPlayerPlaybackConfig(divVideo.f49990g.evaluate(expressionResolver).booleanValue(), divVideo.f50006w.evaluate(expressionResolver).booleanValue(), divVideo.C.evaluate(expressionResolver).booleanValue(), divVideo.f50009z);
        DivPlayerView playerView = divVideoView.getPlayerView();
        int childCount = divVideoView.getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                previewImageView = null;
                break;
            }
            View childAt = divVideoView.getChildAt(i10);
            if (childAt instanceof PreviewImageView) {
                previewImageView = (PreviewImageView) childAt;
                break;
            }
            i10++;
        }
        if (playerView == null) {
            DivPlayerView divPlayerViewMakePlayerView = this.playerFactory.makePlayerView(divVideoView.getContext());
            divPlayerViewMakePlayerView.setVisibility(4);
            divPlayerView = divPlayerViewMakePlayerView;
        } else {
            divPlayerView = playerView;
        }
        final PreviewImageView previewImageView2 = previewImageView == null ? new PreviewImageView(divVideoView.getContext()) : previewImageView;
        applyPreview(divVideo, expressionResolver, new l<ImageRepresentation, r>() { // from class: com.yandex.div.core.view2.divs.DivVideoBinder.bind.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(ImageRepresentation imageRepresentation) {
                invoke2(imageRepresentation);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ImageRepresentation imageRepresentation) {
                if (imageRepresentation != null) {
                    PreviewImageView previewImageView3 = previewImageView2;
                    previewImageView3.setVisibility(0);
                    if (imageRepresentation instanceof ImageRepresentation.PictureDrawable) {
                        previewImageView3.setImageDrawable(((ImageRepresentation.PictureDrawable) imageRepresentation).m3317unboximpl());
                    } else if (imageRepresentation instanceof ImageRepresentation.Bitmap) {
                        previewImageView3.setImageBitmap(((ImageRepresentation.Bitmap) imageRepresentation).m3311unboximpl());
                    }
                }
                divPlayerView.setVisibility(0);
            }
        });
        DivPlayer divPlayerMakePlayer = this.playerFactory.makePlayer(listCreateSource, divPlayerPlaybackConfig);
        divPlayerMakePlayer.addObserver(createObserver(bindingContext, divVideo, previewImageView2));
        divPlayerView.attach(divPlayerMakePlayer);
        observeElapsedTime(divVideoView, divVideo, bindingContext, divPlayerMakePlayer, divStatePath);
        observeMuted(divVideoView, divVideo, expressionResolver, divPlayerMakePlayer);
        observeScale(divVideoView, divVideo, expressionResolver, divPlayerView, previewImageView2);
        if (previewImageView == null && playerView == null) {
            divVideoView.removeAllViews();
            divVideoView.addView(divPlayerView);
            divVideoView.addView(previewImageView2);
        }
        this.videoViewMapper.addView(divVideoView, divVideo);
        BaseDivViewExtensionsKt.bindAspectRatio(divVideoView, divVideo.f49989f, divVideo2 != null ? divVideo2.f49989f : null, expressionResolver);
    }

    public DivVideoBinder(DivBaseBinder divBaseBinder, TwoWayIntegerVariableBinder twoWayIntegerVariableBinder, DivActionBinder divActionBinder, DivVideoViewMapper divVideoViewMapper, ExecutorService executorService, DivPlayerFactory divPlayerFactory) {
        super(divBaseBinder);
        this.variableBinder = twoWayIntegerVariableBinder;
        this.divActionBinder = divActionBinder;
        this.videoViewMapper = divVideoViewMapper;
        this.executorService = executorService;
        this.playerFactory = divPlayerFactory;
    }

    private final DivPlayer.Observer createObserver(BindingContext bindingContext, final DivVideo divVideo, final View view) {
        final Div2View divView = bindingContext.getDivView();
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        return new DivPlayer.Observer() { // from class: com.yandex.div.core.view2.divs.DivVideoBinder.createObserver.1
        };
    }
}
