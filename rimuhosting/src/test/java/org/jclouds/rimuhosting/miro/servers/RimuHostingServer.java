package org.jclouds.rimuhosting.miro.servers;

import org.jclouds.servers.Server;
import org.jclouds.servers.Platform;
import org.jclouds.servers.Instance;
import org.jclouds.rimuhosting.miro.RimuHostingClient;
import com.google.common.base.Service;

import java.util.concurrent.Future;
import java.util.SortedSet;

public class RimuHostingServer implements Server {
   org.jclouds.rimuhosting.miro.domain.Instance rhInstance;

   RimuHostingClient rhClient;

   public RimuHostingServer(org.jclouds.rimuhosting.miro.domain.Instance rhInstance, RimuHostingClient rhClient){
      this.rhInstance = rhInstance;
      this.rhClient = rhClient;
   }

   public String getId() {
      return rhInstance.toString();
   }

   public Platform createPlatform(String id) {
      return null;  //To change body of implemented methods use File | Settings | File Templates.
   }

   public Platform getPlatform(String id) {
      return null;  //To change body of implemented methods use File | Settings | File Templates.
   }

   public SortedSet<Platform> listPlatforms() {
      return null;  //To change body of implemented methods use File | Settings | File Templates.
   }

   public SortedSet<Instance> listInstances() {
      return null;  //To change body of implemented methods use File | Settings | File Templates.
   }

   public Boolean destroyServer() {
      rhClient.destroyInstance(rhInstance.getId());
      return Boolean.TRUE;
   }
}
