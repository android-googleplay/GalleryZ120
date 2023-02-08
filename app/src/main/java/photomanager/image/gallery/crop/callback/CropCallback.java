package photomanager.image.gallery.crop.callback;

import android.graphics.Bitmap;

public interface CropCallback extends Callback {
  void onSuccess(Bitmap cropped);
}
