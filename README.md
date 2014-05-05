desertron
=========

Supercollider in the browser. An experiment.

Installation
------------
SuperCollider 3.6.5 Stable
http://sourceforge.net/projects/supercollider/files/Mac%20OS%20X/3.6/SuperCollider-3.6.5-OSX-universal.dmg/download

`brew install icecast`

brew (in default configuration) installs the default icecast.xml to /usr/local/etc/icecast.xml

- default icecast log dir: /usr/local/Cellar/icecast/2.3.3/var/log/icecast

- start server - `icecast -c /path/to/icecast.xml`

- verify startup
http://localhost:8000/admin/stats.xml
default admin user/pass:
admin/hackme

localhost:8000
source-password: hackme

ogg stream mountpoints have .ogg extension
mp3 streams have no extension

`brew install darkice`
https://code.google.com/p/darkice/

install jack os x
(64/32 bit version: supported Mac OS X versions: Intel 10.6 - 10.9)
full installer, uninstaller & documentation (37.9 MB) (Dec 2, 2013)

first idea:
-- route supercollider via jack into darkice into icecast listen on page

- start JackPilot
- boot jack server
- start sc
  - configure server to route to jack Server.default.options.device = "JackRouter";

darkice cfg defaults to 
/usr/local/etc/darkice.cfg

- need to configure this to receive audio from jack