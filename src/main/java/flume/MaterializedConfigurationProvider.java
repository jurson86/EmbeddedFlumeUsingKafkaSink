package flume;

import java.util.Map;

import org.apache.flume.node.MaterializedConfiguration;

public class MaterializedConfigurationProvider {

	public MaterializedConfiguration get(String name,
			Map<String, String> properties) {
		 MemoryConfigurationProvider confProvider =
			        new MemoryConfigurationProvider(name, properties);
			    return confProvider.getConfiguration();
	}

}
