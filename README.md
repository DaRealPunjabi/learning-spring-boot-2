# Learning Spring Boot 2.0 - Second Edition
# By: Greg L. Turnquist

### Setup used for this Learning
Java
```
brew update                        ## Update homebrew
brew tap homebrew/cask-versions    ## Allow brew to lookup versions
brew search java                   ## List available java versions
brew cask install java             ## Install Java 13 (latest version)
```

IDE
```
IntelliJ IDEA
```

Command Line Tools
https://developer.apple.com/downloads/index.action
```
installed Command_Line_Tools_for_Xcode_11.dmg to correspond with Xcode version
```

MongoDB 3.0 or higher must be installed, OSX does not include the Homebrew brew package by default.
https://docs.mongodb.com/manual/tutorial/install-mongodb-on-os-x/
```
brew tap mongodb/brew              ## Tap the MongoDB Homebrew Tap
brew install mongodb-community@4.2 ## Install MongoDB

brew services start mongodb-community@4.2 ## Run MongoDB

mongo                              ## Connect and Use MongoDB in (New Terminal Window)
```

RabbitMQ 3.6 or higher must be installed.
https://www.rabbitmq.com/install-homebrew.html
```
brew install rabbitmq              ## Tap the MongoDB Homebrew Tap

## Update .bash_profile
export PATH=$PATH:/usr/local/opt/rabbitmq/sbin ## RabbitMQ server scripts and CLI tools

source ~/.bash_profile             ## Activate updated environment setting
brew services start rabbitmq       ## run rabbitmq

sudo rabbitmqctl status            ## Check version
RabbitMQ version: 3.8.0
```
