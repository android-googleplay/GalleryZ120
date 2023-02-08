package photomanager.image.gallery.crop.animation;

public interface SimpleValueAnimatorListener {
  void onAnimationStarted();

  void onAnimationUpdated(float scale);

  void onAnimationFinished();
}
