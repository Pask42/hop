/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hop.ui.hopgui.file.empty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.apache.hop.core.exception.HopException;
import org.apache.hop.core.variables.IVariables;
import org.apache.hop.core.variables.Variables;
import org.apache.hop.ui.hopgui.context.IGuiContextHandler;
import org.apache.hop.ui.hopgui.file.IHopFileType;
import org.apache.hop.ui.hopgui.file.IHopFileTypeHandler;

public class EmptyHopFileTypeHandler implements IHopFileTypeHandler {

  private IHopFileType emptyFileType;

  public EmptyHopFileTypeHandler() {
    emptyFileType = new EmptyFileType();
  }

  @Override
  public Object getSubject() {
    return null;
  }

  @Override
  public String getName() {
    return null;
  }

  @Override
  public void setName(String name) {
    // Do nothing
  }

  @Override
  public IHopFileType getFileType() {
    return emptyFileType;
  }

  @Override
  public String getFilename() {
    return null;
  }

  @Override
  public void setFilename(String filename) {
    // Do nothing
  }

  @Override
  public void save() throws HopException {
    // Do nothing
  }

  @Override
  public void saveAs(String filename) throws HopException {
    // Do nothing
  }

  @Override
  public void start() {
    // Do nothing
  }

  @Override
  public void stop() {
    // Do nothing
  }

  @Override
  public void pause() {
    // Do nothing
  }

  @Override
  public void resume() {
    // Do nothing
  }

  @Override
  public void preview() {
    // Do nothing
  }

  @Override
  public void debug() {
    // Do nothing
  }

  @Override
  public void redraw() {
    // Do nothing
  }

  @Override
  public void updateGui() {
    // Do nothing
  }

  @Override
  public void selectAll() {
    // Do nothing
  }

  @Override
  public void unselectAll() {
    // Do nothing
  }

  @Override
  public void copySelectedToClipboard() {
    // Do nothing
  }

  @Override
  public void cutSelectedToClipboard() {
    // Do nothing
  }

  @Override
  public void deleteSelected() {
    // Do nothing
  }

  @Override
  public void pasteFromClipboard() {
    // Do nothing
  }

  @Override
  public boolean isCloseable() {
    return true;
  }

  @Override
  public void close() {
    // Do nothing
  }

  @Override
  public boolean hasChanged() {
    return false;
  }

  @Override
  public void undo() {
    // Do nothing
  }

  @Override
  public void redo() {
    // Do nothing
  }

  @Override
  public Map<String, Object> getStateProperties() {
    return Collections.emptyMap();
  }

  @Override
  public void applyStateProperties(Map<String, Object> stateProperties) {
    // Do nothing
  }

  @Override
  public List<IGuiContextHandler> getContextHandlers() {
    List<IGuiContextHandler> handlers = new ArrayList<>();
    return handlers;
  }

  /**
   * The empty hop file type handler doesn't have its own variable
   *
   * @return An empty variables set
   */
  @Override
  public IVariables getVariables() {
    return new Variables();
  }
}
