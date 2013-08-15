package jp.go.aist.hrp.world.simplevehicle;

import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import devrt.osgi.IWorldDataProvider;

public class WorldDataProvider implements IWorldDataProvider {

  @Override
  public String getName() {
    return "Simple Vehicle Range Sensor World"; //$NON-NLS-1$
  }

  @Override
  public String getDescription() {
    return "World for learning range sensor based control of simple vehicle.";
  }

  @Override
  public Image getThumbnail() {
    return ImageDescriptor.createFromFile(this.getClass(), "/resources/thumbnail.png").createImage(); //$NON-NLS-1$
  }

  @Override
  public String getWorldDataURL() {
    return URI.createPlatformPluginURI(Activator.PLUGIN_ID + "/resources/SampleSV_RangeSensor.xml", true).toString(); //$NON-NLS-1$
  }

}
