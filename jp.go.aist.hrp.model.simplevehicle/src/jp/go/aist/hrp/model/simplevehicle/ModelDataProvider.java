package jp.go.aist.hrp.model.simplevehicle;

import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import devrt.osgi.IModelDataProvider;

public class ModelDataProvider implements IModelDataProvider {

  @Override
  public String getName() {
    return "Simple vehicle"; //$NON-NLS-1$
  }

  @Override
  public String getDescription() {
    return Messages.ModelDataProvider_1;
  }

  @Override
  public Image getThumbnail() {
    return ImageDescriptor.createFromFile(this.getClass(), "/resources/thumbnail.png").createImage(); //$NON-NLS-1$
  }

  @Override
  public String getModelDataURL() {
    return URI.createPlatformPluginURI(Activator.PLUGIN_ID + "/resources/simple_vehicle.wrl", true).toString(); //$NON-NLS-1$
  }

}
