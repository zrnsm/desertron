Server.default.options.device = "JackRouter";
Server.default.boot;
Server.default.quit;
{SinOsc.ar(MouseX.kr(100,10000))}.play;