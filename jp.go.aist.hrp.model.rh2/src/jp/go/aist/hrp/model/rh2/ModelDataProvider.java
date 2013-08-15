package jp.go.aist.hrp.model.rh2;

import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import devrt.osgi.IModelDataProvider;

public class ModelDataProvider implements IModelDataProvider {

  @Override
  public String getName() {
    return "RH2"; //$NON-NLS-1$
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
    //return URI.createPlatformPluginURI(Activator.PLUGIN_ID + "/resources/RH2_withArm_withObstacleBumpSensor.wrl", true).toString();
    return URI.createPlatformPluginURI(Activator.PLUGIN_ID + "/resources/RH2_withArm_withoutSensor.wrl", true).toString(); //$NON-NLS-1$
  }

}
