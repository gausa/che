/*
 * Copyright (c) 2012-2017 Red Hat, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 */
package org.eclipse.che.api.core.model.workspace.config;

import java.util.List;
import java.util.Map;

/**
 * Machine configuration
 *
 * @author Alexander Garagatyi
 */
public interface MachineConfig {
  /**
   * Returns configured installers.
   *
   * <p>Values can be installer id with version separated with ':' symbol or just id then latest
   * version will be used. Values examples: org.exec-agent:v1.0, org.exec-agent,
   * org.exec-agent:latest.
   */
  List<String> getInstallers();

  /** Returns mapping of references to configurations of servers deployed into machine. */
  Map<String, ? extends ServerConfig> getServers();

  /** Returns attributes of resources of machine. */
  Map<String, String> getAttributes();
}
