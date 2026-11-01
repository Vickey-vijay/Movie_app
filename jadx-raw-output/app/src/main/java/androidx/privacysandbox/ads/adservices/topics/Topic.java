package androidx.privacysandbox.ads.adservices.topics;

/* JADX INFO: compiled from: Topic.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class Topic {
    private final long modelVersion;
    private final long taxonomyVersion;
    private final int topicId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Topic)) {
            return false;
        }
        Topic topic = (Topic) obj;
        return this.taxonomyVersion == topic.taxonomyVersion && this.modelVersion == topic.modelVersion && this.topicId == topic.topicId;
    }

    public final long getModelVersion() {
        return this.modelVersion;
    }

    public final long getTaxonomyVersion() {
        return this.taxonomyVersion;
    }

    public final int getTopicId() {
        return this.topicId;
    }

    public int hashCode() {
        return (((Long.hashCode(this.taxonomyVersion) * 31) + Long.hashCode(this.modelVersion)) * 31) + Integer.hashCode(this.topicId);
    }

    public String toString() {
        return "Topic { " + ("TaxonomyVersion=" + this.taxonomyVersion + ", ModelVersion=" + this.modelVersion + ", TopicCode=" + this.topicId + " }");
    }

    public Topic(long j10, long j11, int i10) {
        this.taxonomyVersion = j10;
        this.modelVersion = j11;
        this.topicId = i10;
    }
}
