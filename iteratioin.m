function iteration(g,x0,maxit,es)

%iteratioin(@(x) (1+cos(x))/3, 0.5, 100, 0.000001)
%veriable
i = 0;
er  = 1;
xi = x0;
erplot = zeros(1,maxit);

fprintf('\ni    xi  g(xi)   er\n');

while abs(er)>es && i<maxit
    i = i+1;
    xold = xi;
    xi = g(xold);

    if xi ~=0 
        er = abs((xi-xold)/xi);
    else
        er = abs(xi-xold);
    end
    erplot(i) = er;

    fprintf('\n%d   %.4f    %.4f    %.4f',i, xold, xi, er);

end

fprintf('\n the approximate root is = %.4f',xi);

% Figure 1
figure;
grid on;

title('Root finding using Fixed Point Iteration');
xlabel('X-axis');
ylabel('Y-axis');

fplot(g,'LineWidth',2);

%figure 2
figure;
hold on;
grid on;
title('Relative error curve')
xlabel('X-axis')
ylabel('Y-axis')
plot(1:i, erplot(1:i),'-o')


end