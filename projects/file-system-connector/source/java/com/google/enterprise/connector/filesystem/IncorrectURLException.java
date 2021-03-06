// Copyright 2010 Google Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.enterprise.connector.filesystem;

/**
 * Should be thrown in cases where the start path URL is not correctly formed.
 */
public class IncorrectURLException extends FilesystemRepositoryDocumentException {

    /**
     * Constructs a new IncorrectURLException with exception message 
     * error message to be shown to user and cause.
     *
     * @param message the message
     * @param cause root failure cause
     */
    public IncorrectURLException(String message, Throwable cause) {
      super(message, FileSystemConnectorErrorMessages.INCORRECT_URL, cause);
    }
}
